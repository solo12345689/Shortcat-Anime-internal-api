.class public final Lio/sentry/x0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lio/sentry/j1;


# instance fields
.field private final a:Lio/sentry/vendor/gson/stream/a;


# direct methods
.method public constructor <init>(Ljava/io/Reader;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lio/sentry/vendor/gson/stream/a;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lio/sentry/vendor/gson/stream/a;-><init>(Ljava/io/Reader;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public B()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->B()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public C0(Lio/sentry/ILogger;Lio/sentry/r0;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->peek()Lio/sentry/vendor/gson/stream/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lio/sentry/vendor/gson/stream/b;->NULL:Lio/sentry/vendor/gson/stream/b;

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 12
    .line 13
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->o()V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    return-object p1

    .line 18
    :cond_0
    invoke-interface {p2, p0, p1}, Lio/sentry/r0;->a(Lio/sentry/j1;Lio/sentry/ILogger;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
.end method

.method public F(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lio/sentry/vendor/gson/stream/a;->F(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public H1()Ljava/lang/Float;
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->peek()Lio/sentry/vendor/gson/stream/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lio/sentry/vendor/gson/stream/b;->NULL:Lio/sentry/vendor/gson/stream/b;

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 12
    .line 13
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->o()V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    return-object v0

    .line 18
    :cond_0
    invoke-virtual {p0}, Lio/sentry/x0;->nextFloat()F

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    return-object v0
.end method

.method public I()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->I()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public N1()Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Lio/sentry/w0;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/sentry/w0;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Lio/sentry/w0;->e(Lio/sentry/x0;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method public T1(Lio/sentry/ILogger;Lio/sentry/r0;)Ljava/util/List;
    .locals 4

    .line 1
    iget-object v0, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->peek()Lio/sentry/vendor/gson/stream/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lio/sentry/vendor/gson/stream/b;->NULL:Lio/sentry/vendor/gson/stream/b;

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 12
    .line 13
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->o()V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    return-object p1

    .line 18
    :cond_0
    iget-object v0, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 19
    .line 20
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->B()V

    .line 21
    .line 22
    .line 23
    new-instance v0, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 29
    .line 30
    invoke-virtual {v1}, Lio/sentry/vendor/gson/stream/a;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    :cond_1
    :try_start_0
    invoke-interface {p2, p0, p1}, Lio/sentry/r0;->a(Lio/sentry/j1;Lio/sentry/ILogger;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catch_0
    move-exception v1

    .line 45
    sget-object v2, Lio/sentry/i3;->WARNING:Lio/sentry/i3;

    .line 46
    .line 47
    const-string v3, "Failed to deserialize object in list."

    .line 48
    .line 49
    invoke-interface {p1, v2, v3, v1}, Lio/sentry/ILogger;->b(Lio/sentry/i3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    :goto_0
    iget-object v1, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 53
    .line 54
    invoke-virtual {v1}, Lio/sentry/vendor/gson/stream/a;->peek()Lio/sentry/vendor/gson/stream/b;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    sget-object v2, Lio/sentry/vendor/gson/stream/b;->BEGIN_OBJECT:Lio/sentry/vendor/gson/stream/b;

    .line 59
    .line 60
    if-eq v1, v2, :cond_1

    .line 61
    .line 62
    :cond_2
    iget-object p1, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 63
    .line 64
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->y()V

    .line 65
    .line 66
    .line 67
    return-object v0
.end method

.method public W()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->W()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public X0()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->X0()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public a()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->l()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->o()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b1()Ljava/lang/Integer;
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->peek()Lio/sentry/vendor/gson/stream/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lio/sentry/vendor/gson/stream/b;->NULL:Lio/sentry/vendor/gson/stream/b;

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 12
    .line 13
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->o()V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    return-object v0

    .line 18
    :cond_0
    iget-object v0, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 19
    .line 20
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->nextInt()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    return-object v0
.end method

.method public c0(Lio/sentry/ILogger;)Ljava/util/TimeZone;
    .locals 4

    .line 1
    iget-object v0, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->peek()Lio/sentry/vendor/gson/stream/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lio/sentry/vendor/gson/stream/b;->NULL:Lio/sentry/vendor/gson/stream/b;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    iget-object p1, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 13
    .line 14
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->o()V

    .line 15
    .line 16
    .line 17
    return-object v2

    .line 18
    :cond_0
    :try_start_0
    iget-object v0, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 19
    .line 20
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->X0()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 25
    .line 26
    .line 27
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    return-object p1

    .line 29
    :catch_0
    move-exception v0

    .line 30
    sget-object v1, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 31
    .line 32
    const-string v3, "Error when deserializing TimeZone"

    .line 33
    .line 34
    invoke-interface {p1, v1, v3, v0}, Lio/sentry/ILogger;->b(Lio/sentry/i3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    return-object v2
.end method

.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d1()Ljava/lang/Long;
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->peek()Lio/sentry/vendor/gson/stream/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lio/sentry/vendor/gson/stream/b;->NULL:Lio/sentry/vendor/gson/stream/b;

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 12
    .line 13
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->o()V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    return-object v0

    .line 18
    :cond_0
    iget-object v0, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 19
    .line 20
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->nextLong()J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    return-object v0
.end method

.method public hasNext()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->hasNext()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public i1()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->peek()Lio/sentry/vendor/gson/stream/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lio/sentry/vendor/gson/stream/b;->NULL:Lio/sentry/vendor/gson/stream/b;

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 12
    .line 13
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->o()V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    return-object v0

    .line 18
    :cond_0
    iget-object v0, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 19
    .line 20
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->X0()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0
.end method

.method public k1(Lio/sentry/ILogger;Lio/sentry/r0;)Ljava/util/Map;
    .locals 4

    .line 1
    iget-object v0, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->peek()Lio/sentry/vendor/gson/stream/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lio/sentry/vendor/gson/stream/b;->NULL:Lio/sentry/vendor/gson/stream/b;

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 12
    .line 13
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->o()V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    return-object p1

    .line 18
    :cond_0
    iget-object v0, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 19
    .line 20
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->x()V

    .line 21
    .line 22
    .line 23
    new-instance v0, Ljava/util/HashMap;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 29
    .line 30
    invoke-virtual {v1}, Lio/sentry/vendor/gson/stream/a;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    :cond_1
    :try_start_0
    iget-object v1, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 37
    .line 38
    invoke-virtual {v1}, Lio/sentry/vendor/gson/stream/a;->r0()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-interface {p2, p0, p1}, Lio/sentry/r0;->a(Lio/sentry/j1;Lio/sentry/ILogger;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catch_0
    move-exception v1

    .line 51
    sget-object v2, Lio/sentry/i3;->WARNING:Lio/sentry/i3;

    .line 52
    .line 53
    const-string v3, "Failed to deserialize object in map."

    .line 54
    .line 55
    invoke-interface {p1, v2, v3, v1}, Lio/sentry/ILogger;->b(Lio/sentry/i3;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    :goto_0
    iget-object v1, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 59
    .line 60
    invoke-virtual {v1}, Lio/sentry/vendor/gson/stream/a;->peek()Lio/sentry/vendor/gson/stream/b;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    sget-object v2, Lio/sentry/vendor/gson/stream/b;->BEGIN_OBJECT:Lio/sentry/vendor/gson/stream/b;

    .line 65
    .line 66
    if-eq v1, v2, :cond_1

    .line 67
    .line 68
    iget-object v1, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 69
    .line 70
    invoke-virtual {v1}, Lio/sentry/vendor/gson/stream/a;->peek()Lio/sentry/vendor/gson/stream/b;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    sget-object v2, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    .line 75
    .line 76
    if-eq v1, v2, :cond_1

    .line 77
    .line 78
    :cond_2
    iget-object p1, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 79
    .line 80
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->I()V

    .line 81
    .line 82
    .line 83
    return-object v0
.end method

.method public l1(Lio/sentry/ILogger;Ljava/util/Map;Ljava/lang/String;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lio/sentry/x0;->N1()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p2, p3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :catch_0
    move-exception p2

    .line 10
    sget-object v0, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 11
    .line 12
    const-string v1, "Error deserializing unknown key: %s"

    .line 13
    .line 14
    filled-new-array {p3}, [Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    invoke-interface {p1, v0, p2, v1, p3}, Lio/sentry/ILogger;->a(Lio/sentry/i3;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public nextDouble()D
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->nextDouble()D

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public nextFloat()F
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->nextDouble()D

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    double-to-float v0, v0

    .line 8
    return v0
.end method

.method public nextInt()I
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->nextInt()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public nextLong()J
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->nextLong()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public peek()Lio/sentry/vendor/gson/stream/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->peek()Lio/sentry/vendor/gson/stream/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public q0()Ljava/lang/Double;
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->peek()Lio/sentry/vendor/gson/stream/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lio/sentry/vendor/gson/stream/b;->NULL:Lio/sentry/vendor/gson/stream/b;

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 12
    .line 13
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->o()V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    return-object v0

    .line 18
    :cond_0
    iget-object v0, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 19
    .line 20
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->nextDouble()D

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    return-object v0
.end method

.method public r0()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->r0()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public u0(Lio/sentry/ILogger;)Ljava/util/Date;
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->peek()Lio/sentry/vendor/gson/stream/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lio/sentry/vendor/gson/stream/b;->NULL:Lio/sentry/vendor/gson/stream/b;

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 12
    .line 13
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->o()V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    return-object p1

    .line 18
    :cond_0
    iget-object v0, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 19
    .line 20
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->X0()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0, p1}, Lio/sentry/j1;->L0(Ljava/lang/String;Lio/sentry/ILogger;)Ljava/util/Date;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1
.end method

.method public w0()Ljava/lang/Boolean;
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->peek()Lio/sentry/vendor/gson/stream/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lio/sentry/vendor/gson/stream/b;->NULL:Lio/sentry/vendor/gson/stream/b;

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 12
    .line 13
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->o()V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    return-object v0

    .line 18
    :cond_0
    iget-object v0, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 19
    .line 20
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->l()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    return-object v0
.end method

.method public x()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->x()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public y()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/x0;->a:Lio/sentry/vendor/gson/stream/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->y()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
