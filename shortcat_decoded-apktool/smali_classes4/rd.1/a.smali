.class public final Lrd/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:J

.field private d:Landroid/net/Uri;

.field private e:Lorg/json/JSONObject;

.field private f:Lorg/json/JSONObject;

.field private g:Lorg/json/JSONObject;

.field private h:Ljava/util/Date;

.field private i:Ljava/lang/String;

.field private j:[B

.field private k:Lsd/a;

.field private l:Ljava/lang/String;

.field private m:Z

.field private n:Z

.field private o:Ljava/lang/String;

.field private p:Ljava/lang/String;

.field private q:Ljava/lang/String;

.field private r:Ljava/lang/Float;

.field private s:[Ljava/lang/Float;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lrd/a;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lrd/a;->b:Ljava/lang/String;

    .line 7
    .line 8
    sget-object p1, Lsd/a;->a:Lsd/a;

    .line 9
    .line 10
    iput-object p1, p0, Lrd/a;->k:Lsd/a;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final A(Lorg/json/JSONObject;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lrd/a;->e:Lorg/json/JSONObject;

    .line 2
    .line 3
    return-void
.end method

.method public final B(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lrd/a;->c:J

    .line 2
    .line 3
    return-void
.end method

.method public final C(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lrd/a;->n:Z

    .line 2
    .line 3
    return-void
.end method

.method public final D(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lrd/a;->m:Z

    .line 2
    .line 3
    return-void
.end method

.method public final E(Lorg/json/JSONObject;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lrd/a;->g:Lorg/json/JSONObject;

    .line 2
    .line 3
    return-void
.end method

.method public final F(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lrd/a;->i:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final G(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lrd/a;->p:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final H(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lrd/a;->q:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final I(Ljava/lang/Float;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lrd/a;->r:Ljava/lang/Float;

    .line 2
    .line 3
    return-void
.end method

.method public final J([Ljava/lang/Float;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lrd/a;->s:[Ljava/lang/Float;

    .line 2
    .line 3
    return-void
.end method

.method public final K(Landroid/net/Uri;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lrd/a;->d:Landroid/net/Uri;

    .line 2
    .line 3
    return-void
.end method

.method public final a()Ljava/util/Date;
    .locals 1

    .line 1
    iget-object v0, p0, Lrd/a;->h:Ljava/util/Date;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lrd/a;->o:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lrd/a;->l:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lrd/a;->f:Lorg/json/JSONObject;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lrd/a;->b:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    const/4 v1, 0x2

    .line 9
    const/4 v2, 0x0

    .line 10
    const-string v3, "."

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    invoke-static {v0, v3, v4, v1, v2}, LDf/r;->Q(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0
.end method

.method public final f()[B
    .locals 1

    .line 1
    iget-object v0, p0, Lrd/a;->j:[B

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()Lsd/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lrd/a;->k:Lsd/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lrd/a;->e:Lorg/json/JSONObject;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lrd/a;->c:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lrd/a;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lrd/a;->m:Z

    .line 2
    .line 3
    return v0
.end method

.method public final l()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lrd/a;->g:Lorg/json/JSONObject;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lrd/a;->i:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final n()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lrd/a;->p:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final o()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lrd/a;->q:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final p()Ljava/lang/Float;
    .locals 1

    .line 1
    iget-object v0, p0, Lrd/a;->r:Ljava/lang/Float;

    .line 2
    .line 3
    return-object v0
.end method

.method public final q()[Ljava/lang/Float;
    .locals 1

    .line 1
    iget-object v0, p0, Lrd/a;->s:[Ljava/lang/Float;

    .line 2
    .line 3
    return-object v0
.end method

.method public final r()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lrd/a;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final s()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lrd/a;->d:Landroid/net/Uri;

    .line 2
    .line 3
    return-object v0
.end method

.method public final t()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lrd/a;->n:Z

    .line 2
    .line 3
    return v0
.end method

.method public final u(Ljava/util/Date;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lrd/a;->h:Ljava/util/Date;

    .line 2
    .line 3
    return-void
.end method

.method public final v(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lrd/a;->o:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final w(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lrd/a;->l:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final x(Lorg/json/JSONObject;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lrd/a;->f:Lorg/json/JSONObject;

    .line 2
    .line 3
    return-void
.end method

.method public final y([B)V
    .locals 0

    .line 1
    iput-object p1, p0, Lrd/a;->j:[B

    .line 2
    .line 3
    return-void
.end method

.method public final z(Lsd/a;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lrd/a;->k:Lsd/a;

    .line 7
    .line 8
    return-void
.end method
