package ru.geekbrains.lesson6;

    public class dog {
        public static class dog extends animals { //Не пойму что не так?
            private int runMaxDistance;
            private int swimMaxDistance;
            private float jumpMaxDistance;
            public dog(int runDistance, int swimDistance, float jumpHeight) {
                super(runDistance, swimDistance, jumpHeight);
            }
        }
    }
