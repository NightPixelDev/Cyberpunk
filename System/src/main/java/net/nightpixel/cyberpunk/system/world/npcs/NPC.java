package net.nightpixel.cyberpunk.system.world.npcs;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import java.util.List;

public class NPC {

    long id;
    String name;
    Location location;
    Entity entity;
    EntityType entityType;
    boolean enemy;
    List<Player> targeted;
    int maxHealth;
    int maxShield;
    int health;
    int shield;

    public NPC() {
    }

    public NPC(String name) {
        this.name = name;
    }

    public NPC(long id) {
        this.id = id;
    }

    public NPC(String name, Location location, Entity entity, EntityType entityType, boolean enemy, List<Player> targeted, int maxHealth, int maxShield, int health, int shield) {
        this.name = name;
        this.location = location;
        this.entity = entity;
        this.entityType = entityType;
        this.enemy = enemy;
        this.targeted = targeted;
        this.maxHealth = maxHealth;
        this.maxShield = maxShield;
        this.health = health;
        this.shield = shield;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Entity getEntity() {
        return entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    public EntityType getEntityType() {
        return entityType;
    }

    public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
    }

    public boolean isEnemy() {
        return enemy;
    }

    public void setEnemy(boolean enemy) {
        this.enemy = enemy;
    }

    public List<Player> getTargeted() {
        return targeted;
    }

    public void setTargeted(List<Player> targeted) {
        this.targeted = targeted;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getMaxShield() {
        return maxShield;
    }

    public void setMaxShield(int maxShield) {
        this.maxShield = maxShield;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    public void spawn(){
        assert entityType.getEntityClass() != null;
        entity = location.getWorld().spawn(location, entityType.getEntityClass());
    }

}
