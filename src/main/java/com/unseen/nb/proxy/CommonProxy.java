// CommonProxy - 只保留签名，不做任何事
public void spawnParticle(int particleId, double posX, double posY, double posZ, 
                          double speedX, double speedY, double speedZ, int... parameters) {}

public void spawnParticle(int particleId, World world, double posX, double posY, double posZ, 
                          double speedX, double speedY, double speedZ, int... parameters) {
    if (world.isRemote) {
        // 这里应该调用 ClientProxy 的实现，但由于代理模式限制，用另一方式
    }
}
