package Chess;
    public class Springer extends ChessPiece {

        /**
         * Erstellt einen Springer mit den gegebenen Koordinaten und Besitzer.
         *
         * @param besitzer    Der Besitzer der Figur (-1 für Schwarz, 1 für Weiß).
         * @param xKoordinate Die Startposition der Figur auf der x-Achse.
         * @param yKoordinate Die Startposition der Figur auf der y-Achse.
         */
        public Springer(int besitzer, int xKoordinate, int yKoordinate) {
            super(3, besitzer, "S", xKoordinate, yKoordinate);
        }

        /**
         * Überprüft, ob sich der Springer auf das angegebene Feld bewegen kann.
         *
         * @param xKoordinate Die Ziel-x-Koordinate auf dem Brett.
         * @param yKoordinate Die Ziel-y-Koordinate auf dem Brett.
         * @return {@code true}, wenn die Bewegung erlaubt ist, sonst {@code false}.
         */
        @Override
        public boolean canMove(int xKoordinate, int yKoordinate) {
            int dx = Math.abs(this.getXKoordinate() - xKoordinate);
            int dy = Math.abs(this.getYKoordinate() - yKoordinate);

            return (dx == 2 && dy == 1) || (dx == 1 && dy == 2);
        }
    }

