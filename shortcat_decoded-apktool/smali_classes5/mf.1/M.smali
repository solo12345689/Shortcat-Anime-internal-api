.class public final Lmf/M;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lmf/j;


# instance fields
.field private final a:LUe/d;

.field private final b:LUe/a;

.field private final c:Lkotlin/jvm/functions/Function1;

.field private final d:Ljava/util/Map;


# direct methods
.method public constructor <init>(LSe/n;LUe/d;LUe/a;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const-string v0, "proto"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "nameResolver"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "metadataVersion"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "classSource"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p2, p0, Lmf/M;->a:LUe/d;

    .line 25
    .line 26
    iput-object p3, p0, Lmf/M;->b:LUe/a;

    .line 27
    .line 28
    iput-object p4, p0, Lmf/M;->c:Lkotlin/jvm/functions/Function1;

    .line 29
    .line 30
    invoke-virtual {p1}, LSe/n;->K()Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const-string p2, "getClass_List(...)"

    .line 35
    .line 36
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const/16 p2, 0xa

    .line 40
    .line 41
    invoke-static {p1, p2}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    invoke-static {p2}, LUd/S;->e(I)I

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    const/16 p3, 0x10

    .line 50
    .line 51
    invoke-static {p2, p3}, Loe/j;->e(II)I

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    new-instance p3, Ljava/util/LinkedHashMap;

    .line 56
    .line 57
    invoke-direct {p3, p2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 58
    .line 59
    .line 60
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    if-eqz p2, :cond_0

    .line 69
    .line 70
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    move-object p4, p2

    .line 75
    check-cast p4, LSe/c;

    .line 76
    .line 77
    iget-object v0, p0, Lmf/M;->a:LUe/d;

    .line 78
    .line 79
    invoke-virtual {p4}, LSe/c;->J0()I

    .line 80
    .line 81
    .line 82
    move-result p4

    .line 83
    invoke-static {v0, p4}, Lmf/L;->a(LUe/d;I)LXe/b;

    .line 84
    .line 85
    .line 86
    move-result-object p4

    .line 87
    invoke-interface {p3, p4, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_0
    iput-object p3, p0, Lmf/M;->d:Ljava/util/Map;

    .line 92
    .line 93
    return-void
.end method


# virtual methods
.method public a(LXe/b;)Lmf/i;
    .locals 5

    .line 1
    const-string v0, "classId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lmf/M;->d:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, LSe/c;

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    return-object p1

    .line 18
    :cond_0
    new-instance v1, Lmf/i;

    .line 19
    .line 20
    iget-object v2, p0, Lmf/M;->a:LUe/d;

    .line 21
    .line 22
    iget-object v3, p0, Lmf/M;->b:LUe/a;

    .line 23
    .line 24
    iget-object v4, p0, Lmf/M;->c:Lkotlin/jvm/functions/Function1;

    .line 25
    .line 26
    invoke-interface {v4, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Lye/h0;

    .line 31
    .line 32
    invoke-direct {v1, v2, v0, v3, p1}, Lmf/i;-><init>(LUe/d;LSe/c;LUe/a;Lye/h0;)V

    .line 33
    .line 34
    .line 35
    return-object v1
.end method

.method public final b()Ljava/util/Collection;
    .locals 1

    .line 1
    iget-object v0, p0, Lmf/M;->d:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/Collection;

    .line 8
    .line 9
    return-object v0
.end method
