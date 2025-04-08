package Chess;

    public class Laeufer extends ChessPiece {

        /**
         * Erstellt einen Läufer mit den gegebenen Koordinaten und Besitzer.
         *
         * @param besitzer    Der Besitzer der Figur (-1 für Schwarz, 1 für Weiß).
         * @param xKoordinate Die Startposition der Figur auf der x-Achse.
         * @param yKoordinate Die Startposition der Figur auf der y-Achse.
         */
        public Laeufer(int besitzer, int xKoordinate, int yKoordinate) {
            super(3, besitzer, "L", xKoordinate, yKoordinate);
        }

        /**
         * Überprüft, ob sich der Läufer auf das angegebene Feld bewegen kann.
         *
         * @param xKoordinate Die Ziel-x-Koordinate auf dem Brett.
         * @param yKoordinate Die Ziel-y-Koordinate auf dem Brett.
         * @return {@code true},oder {@code false}.
         */
        @Override
        public boolean canMove(int xKoordinate, int yKoordinate) {
            int dx = Math.abs(this.getXKoordinate() - xKoordinate);
            int dy = Math.abs(this.getYKoordinate() - yKoordinate);
            return dx == dy; } }

