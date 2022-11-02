/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rizka.anggota.service.repository;

import com.rizka.anggota.service.repository.AnggotaRepository.Anggota;
import org.springframework.stereotype.Repository;

/**
 *
 * @author DELL
 */
@Repository
public interface AnggotaRepository extends JpaRepository<Anggota, Long> {
    
    public Anggota findByAnggotaId(Long anggotaId);

    public static class Anggota {

        public Anggota() {
        }
    }

    
}
