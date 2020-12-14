package com.api.project.model.medicalPojo;

/**
 * Created by Benjamin Adjei on 11/12/20
 */

    public class MyPojo
    {
        private Problems[] problems;

        public Problems[] getProblems ()
        {
            return problems;
        }

        public void setProblems (Problems[] problems)
        {
            this.problems = problems;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [problems = "+problems+"]";
        }
    }

