# ![DevSuperior logo](https://raw.githubusercontent.com/devsuperior/bds-assets/main/ds/devsuperior-logo-small.png)  Autorrelacionamento - estudo de caso usando Spring
**Nelio Alves**

## Realização
[DevSuperior - Escola de programação](https://devsuperior.com.br)

[![DevSuperior no Instagram](https://raw.githubusercontent.com/devsuperior/bds-assets/main/ds/ig-icon.png)](https://instagram.com/devsuperior.ig)
[![DevSuperior no Youtube](https://raw.githubusercontent.com/devsuperior/bds-assets/main/ds/yt-icon.png)](https://youtube.com/devsuperior)

**Bootcamp Spring React - Matrículas abertas só até sexta-feira!**

https://devsuperior.com.br/bootcamp

## Vídeo desta aula no Youtube

[![Image](https://img.youtube.com/vi/mCOcn9LQkos/mqdefault.jpg "Vídeo no Youtube")](https://youtu.be/mCOcn9LQkos)

## Modelo conceitual

![Image](https://raw.githubusercontent.com/devsuperior/aula-20210511/main/mc-autorrelacionamento.png "Modelo conceitual")

## Código para copiar

```java
@ManyToMany
@JoinTable(name = "tb_follows",
	joinColumns = @JoinColumn(name = "user_id"),
	inverseJoinColumns = @JoinColumn(name = "followed_id"))	
Set<User> following = new HashSet<>();

@ManyToMany(mappedBy = "following")
Set<User> followers = new HashSet<>();
```

