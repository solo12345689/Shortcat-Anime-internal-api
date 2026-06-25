.class public interface abstract Lqb/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# virtual methods
.method public a(Ljava/lang/String;)Ljava/util/List;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, p1, v0}, Lqb/b;->d(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    return-object p1
.end method

.method public abstract b(Ljava/lang/String;)Ljava/lang/Object;
.end method

.method public c(Ljava/lang/String;)Lqb/b;
    .locals 1

    .line 1
    invoke-interface {p0, p1}, Lqb/b;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    instance-of v0, p1, Ljava/util/Map;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lqb/a;

    .line 10
    .line 11
    check-cast p1, Ljava/util/Map;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Lqb/a;-><init>(Ljava/util/Map;)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    return-object p1
.end method

.method public abstract d(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
.end method

.method public abstract e(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;
.end method

.method public abstract f(Ljava/lang/String;)Z
.end method

.method public getBoolean(Ljava/lang/String;)Z
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-interface {p0, p1, v0}, Lqb/b;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    return p1
.end method

.method public abstract getBoolean(Ljava/lang/String;Z)Z
.end method

.method public getInt(Ljava/lang/String;)I
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-interface {p0, p1, v0}, Lqb/b;->getInt(Ljava/lang/String;I)I

    move-result p1

    return p1
.end method

.method public abstract getInt(Ljava/lang/String;I)I
.end method

.method public getMap(Ljava/lang/String;)Ljava/util/Map;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, p1, v0}, Lqb/b;->e(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    return-object p1
.end method

.method public getString(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-interface {p0, p1, v0}, Lqb/b;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public abstract getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end method
