.class abstract LOg/d;
.super Ljava/lang/Object;


# static fields
.field private static a:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LOg/d;->a:Ljava/util/Map;

    .line 7
    .line 8
    sget-object v1, LSg/a;->b:LSg/a;

    .line 9
    .line 10
    invoke-virtual {v1}, LSg/a;->b()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    sget-object v2, Lgh/e;->d:Lgh/e;

    .line 15
    .line 16
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    sget-object v0, LOg/d;->a:Ljava/util/Map;

    .line 20
    .line 21
    sget-object v1, LSg/a;->c:LSg/a;

    .line 22
    .line 23
    invoke-virtual {v1}, LSg/a;->b()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    sget-object v2, Lgh/e;->e:Lgh/e;

    .line 28
    .line 29
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    sget-object v0, LOg/d;->a:Ljava/util/Map;

    .line 33
    .line 34
    sget-object v1, LSg/a;->d:LSg/a;

    .line 35
    .line 36
    invoke-virtual {v1}, LSg/a;->b()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    sget-object v2, Lgh/e;->f:Lgh/e;

    .line 41
    .line 42
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method static a(Ljava/lang/String;)Lgh/e;
    .locals 1

    .line 1
    sget-object v0, LOg/d;->a:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lgh/e;

    .line 8
    .line 9
    return-object p0
.end method
