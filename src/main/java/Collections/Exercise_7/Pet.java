package Collections.Exercise_7;

    public class Pet {
        private String colour;
        private float weight;

        public void setWeight(float weight) {
            this.weight = weight;
        }

        public void setColour(String colour) {
            this.colour = colour;
        }

        @Override
        public String toString() {
            return "{" +
                    "colour='" + colour + '\'' +
                    ", weight=" + weight +
                    " Kg}";
        }
    }
