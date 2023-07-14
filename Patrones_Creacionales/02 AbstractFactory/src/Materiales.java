// Clases de materiales
interface Timon {
    String getDescription();
}

interface Chasis {
    String getDescription();
}

interface Llantas {
    String getDescription();
}

// Clases de variantes de materiales
class BajaCalidadTimon implements Timon {
    @Override
    public String getDescription() {
        return "Timón de baja calidad";
    }
}

class MediaCalidadTimon implements Timon {
    @Override
    public String getDescription() {
        return "Timón de calidad media";
    }
}

class AltaCalidadTimon implements Timon {
    @Override
    public String getDescription() {
        return "Timón de alta calidad";
    }
}

class BajaCalidadChasis implements Chasis {
    @Override
    public String getDescription() {
        return "Chasis de baja calidad";
    }
}

class MediaCalidadChasis implements Chasis {
    @Override
    public String getDescription() {
        return "Chasis de calidad media";
    }
}

class AltaCalidadChasis implements Chasis {
    @Override
    public String getDescription() {
        return "Chasis de alta calidad";
    }
}

class BajaCalidadLlantas implements Llantas {
    @Override
    public String getDescription() {
        return "Llantas de baja calidad";
    }
}

class MediaCalidadLlantas implements Llantas {
    @Override
    public String getDescription() {
        return "Llantas de calidad media";
    }
}

class AltaCalidadLlantas implements Llantas {
    @Override
    public String getDescription() {
        return "Llantas de alta calidad";
    }
}