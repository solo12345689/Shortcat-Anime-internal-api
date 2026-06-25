.class public LR4/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/bumptech/glide/load/data/d;
.implements Ldg/f;


# instance fields
.field private final a:Ldg/e$a;

.field private final b:LY4/h;

.field private c:Ljava/io/InputStream;

.field private d:Ldg/F;

.field private e:Lcom/bumptech/glide/load/data/d$a;

.field private volatile f:Ldg/e;


# direct methods
.method public constructor <init>(Ldg/e$a;LY4/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LR4/a;->a:Ldg/e$a;

    .line 5
    .line 6
    iput-object p2, p0, LR4/a;->b:LY4/h;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Class;
    .locals 1

    .line 1
    const-class v0, Ljava/io/InputStream;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, LR4/a;->c:Ljava/io/InputStream;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    :catch_0
    :cond_0
    iget-object v0, p0, LR4/a;->d:Ldg/F;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0}, Ldg/F;->close()V

    .line 13
    .line 14
    .line 15
    :cond_1
    const/4 v0, 0x0

    .line 16
    iput-object v0, p0, LR4/a;->e:Lcom/bumptech/glide/load/data/d$a;

    .line 17
    .line 18
    return-void
.end method

.method public cancel()V
    .locals 1

    .line 1
    iget-object v0, p0, LR4/a;->f:Ldg/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ldg/e;->cancel()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public d()LS4/a;
    .locals 1

    .line 1
    sget-object v0, LS4/a;->b:LS4/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public e(Lcom/bumptech/glide/g;Lcom/bumptech/glide/load/data/d$a;)V
    .locals 3

    .line 1
    new-instance p1, Ldg/C$a;

    .line 2
    .line 3
    invoke-direct {p1}, Ldg/C$a;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LR4/a;->b:LY4/h;

    .line 7
    .line 8
    invoke-virtual {v0}, LY4/h;->h()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p1, v0}, Ldg/C$a;->m(Ljava/lang/String;)Ldg/C$a;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object v0, p0, LR4/a;->b:LY4/h;

    .line 17
    .line 18
    invoke-virtual {v0}, LY4/h;->e()Ljava/util/Map;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Ljava/util/Map$Entry;

    .line 41
    .line 42
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    check-cast v2, Ljava/lang/String;

    .line 47
    .line 48
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    check-cast v1, Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {p1, v2, v1}, Ldg/C$a;->a(Ljava/lang/String;Ljava/lang/String;)Ldg/C$a;

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    invoke-virtual {p1}, Ldg/C$a;->b()Ldg/C;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iput-object p2, p0, LR4/a;->e:Lcom/bumptech/glide/load/data/d$a;

    .line 63
    .line 64
    iget-object p2, p0, LR4/a;->a:Ldg/e$a;

    .line 65
    .line 66
    invoke-interface {p2, p1}, Ldg/e$a;->a(Ldg/C;)Ldg/e;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iput-object p1, p0, LR4/a;->f:Ldg/e;

    .line 71
    .line 72
    iget-object p1, p0, LR4/a;->f:Ldg/e;

    .line 73
    .line 74
    invoke-interface {p1, p0}, Ldg/e;->O1(Ldg/f;)V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public h(Ldg/e;Ldg/E;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Ldg/E;->j()Ldg/F;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, LR4/a;->d:Ldg/F;

    .line 6
    .line 7
    invoke-virtual {p2}, Ldg/E;->J()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, LR4/a;->d:Ldg/F;

    .line 14
    .line 15
    invoke-static {p1}, Lo5/k;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Ldg/F;

    .line 20
    .line 21
    invoke-virtual {p1}, Ldg/F;->h()J

    .line 22
    .line 23
    .line 24
    move-result-wide p1

    .line 25
    iget-object v0, p0, LR4/a;->d:Ldg/F;

    .line 26
    .line 27
    invoke-virtual {v0}, Ldg/F;->a()Ljava/io/InputStream;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0, p1, p2}, Lo5/c;->b(Ljava/io/InputStream;J)Ljava/io/InputStream;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, LR4/a;->c:Ljava/io/InputStream;

    .line 36
    .line 37
    iget-object p2, p0, LR4/a;->e:Lcom/bumptech/glide/load/data/d$a;

    .line 38
    .line 39
    invoke-interface {p2, p1}, Lcom/bumptech/glide/load/data/d$a;->f(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_0
    iget-object p1, p0, LR4/a;->e:Lcom/bumptech/glide/load/data/d$a;

    .line 44
    .line 45
    new-instance v0, LS4/e;

    .line 46
    .line 47
    invoke-virtual {p2}, Ldg/E;->O()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {p2}, Ldg/E;->o()I

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    invoke-direct {v0, v1, p2}, LS4/e;-><init>(Ljava/lang/String;I)V

    .line 56
    .line 57
    .line 58
    invoke-interface {p1, v0}, Lcom/bumptech/glide/load/data/d$a;->c(Ljava/lang/Exception;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public j(Ldg/e;Ljava/io/IOException;)V
    .locals 1

    .line 1
    const/4 p1, 0x3

    .line 2
    const-string v0, "OkHttpFetcher"

    .line 3
    .line 4
    invoke-static {v0, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    const-string p1, "OkHttp failed to obtain result"

    .line 11
    .line 12
    invoke-static {v0, p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object p1, p0, LR4/a;->e:Lcom/bumptech/glide/load/data/d$a;

    .line 16
    .line 17
    invoke-interface {p1, p2}, Lcom/bumptech/glide/load/data/d$a;->c(Ljava/lang/Exception;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
