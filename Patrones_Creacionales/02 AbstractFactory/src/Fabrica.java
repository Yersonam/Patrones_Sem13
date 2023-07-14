// Abstract Factory
interface AbstractFactory {
    Timon createTimon();
    Chasis createChasis();
    Llantas createLlantas();
}

// Fábricas concretas
class BajaCalidadFactory implements AbstractFactory {
    @Override
    public Timon createTimon() {
        return new BajaCalidadTimon();
    }

    @Override
    public Chasis createChasis() {
        return new BajaCalidadChasis();
    }

    @Override
    public Llantas createLlantas() {
        return new BajaCalidadLlantas();
    }
}

class MediaCalidadFactory implements AbstractFactory {
    @Override
    public Timon createTimon() {
        return new MediaCalidadTimon();
    }

    @Override
    public Chasis createChasis() {
        return new MediaCalidadChasis();
    }

    @Override
    public Llantas createLlantas() {
        return new MediaCalidadLlantas();
    }
}

class AltaCalidadFactory implements AbstractFactory {
    @Override
    public Timon createTimon() {
        return new AltaCalidadTimon();
    }

    @Override
    public Chasis createChasis() {
        return new AltaCalidadChasis();
    }

    @Override
    public Llantas createLlantas() {
        return new AltaCalidadLlantas();
    }
}