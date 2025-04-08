package Chess;

    public class Koenig extends ChessPiece {

        /**
         * Erstellt einen König mit den gegebenen Koordinaten und Besitzer.
         *
         * @param besitzer    Der Besitzer der Figur (-1 für Schwarz, 1 für Weiß).
         * @param xKoordinate Die Startposition der Figur auf der x-Achse.
         * @param yKoordinate Die Startposition der Figur auf der y-Achse.
         */
        public Koenig(int besitzer, int xKoordinate, int yKoordinate) {
            super(Integer.MAX_VALUE, besitzer, "K", xKoordinate, yKoordinate);
        }

        /**
         * Überprüft, ob sich der König auf das angegebene Feld bewegen kann.
         *
         * @param x Die Ziel-x-Koordinate auf dem Brett.
         * @param y Die Ziel-y-Koordinate auf dem Brett.
         * @return {@code true}, wenn die Bewegung erlaubt ist, sonst {@code false}.
         */
        @Override
        public boolean canMove(int x, int y) {
            int dx = Math.abs(this.getXKoordinate() - x);
            int dy = Math.abs(this.getYKoordinate() - y);
            return (dx == 0 || dx == 1) && (dy == 0 || dy == 1); }}

