package Chess;

    public class Turm extends ChessPiece {

        /**
         * Erstellt einen Turm mit den gegebenen Koordinaten und Besitzer.
         *
         * @param besitzer    Der Besitzer der Figur (-1 für Schwarz, 1 für Weiß).
         * @param xKoordinate Die Startposition der Figur auf der x-Achse.
         * @param yKoordinate Die Startposition der Figur auf der y-Achse.
         */
        public Turm(int besitzer, int xKoordinate, int yKoordinate) {
            super(5, besitzer, "T", xKoordinate, yKoordinate);
        }

        /**
         * Überprüft, ob sich der Turm auf das angegebene Feld bewegen kann.
         *
         * @param xKoordinate Die Ziel-x-Koordinate auf dem Brett.
         * @param yKoordinate Die Ziel-y-Koordinate auf dem Brett.
         * @return {@code true}, wenn die Bewegung erlaubt ist, sonst {@code false}.
         */
        @Override
        public boolean canMove(int xKoordinate, int yKoordinate) {
            return this.getXKoordinate() == xKoordinate || this.getYKoordinate() == yKoordinate; }}

