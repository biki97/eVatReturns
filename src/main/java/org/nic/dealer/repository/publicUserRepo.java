package org.nic.dealer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface publicUserRepo extends JpaRepository<publicUser,Long> {
}


//spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
