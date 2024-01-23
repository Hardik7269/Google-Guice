package com.home.main;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;
import com.home.binders.Break;
import com.home.binders.Beraks; // Assuming Beraks is correctly defined in the com.home.binders package
import com.home.prac.OfficeFlow;
import com.home.prac.OfficeFlowImpl;
import com.home.prac.Ps5;
import com.home.prac.Ps5Impl;
import com.home.prac.Work;
import com.home.prac.WorkImpl;

public class GuiceModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(OfficeFlow.class).to(OfficeFlowImpl.class);
        bind(Ps5.class).to(Ps5Impl.class);
        bind(Work.class).to(WorkImpl.class);

        bindInterceptor(Matchers.any(), Matchers.annotatedWith(Break.class), new Beraks()); // Fix the typo here
    }
}
