.class public final Lgc/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lhc/h;

.field private final c:Ljava/util/Map;

.field private final d:Ljava/util/Map;

.field private final e:Lkotlin/jvm/functions/Function2;

.field private final f:Ljava/util/List;

.field private final g:Lie/a;

.field private final h:Ljava/util/Map;

.field private final i:Ljava/util/Map;

.field private final j:Lbc/f;

.field private final k:Ljava/util/Map;

.field private final l:Ljava/util/Map;

.field private final m:LUb/e;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lhc/h;Ljava/util/Map;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Ljava/util/List;)V
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "objectDefinition"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "viewManagerDefinitions"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "eventListeners"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "classData"

    .line 22
    .line 23
    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lgc/e;->a:Ljava/lang/String;

    .line 30
    .line 31
    iput-object p2, p0, Lgc/e;->b:Lhc/h;

    .line 32
    .line 33
    iput-object p3, p0, Lgc/e;->c:Ljava/util/Map;

    .line 34
    .line 35
    iput-object p4, p0, Lgc/e;->d:Ljava/util/Map;

    .line 36
    .line 37
    iput-object p5, p0, Lgc/e;->e:Lkotlin/jvm/functions/Function2;

    .line 38
    .line 39
    iput-object p6, p0, Lgc/e;->f:Ljava/util/List;

    .line 40
    .line 41
    invoke-virtual {p2}, Lhc/h;->f()Lie/a;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iput-object p1, p0, Lgc/e;->g:Lie/a;

    .line 46
    .line 47
    invoke-virtual {p2}, Lhc/h;->h()Ljava/util/Map;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iput-object p1, p0, Lgc/e;->h:Ljava/util/Map;

    .line 52
    .line 53
    invoke-virtual {p2}, Lhc/h;->b()Ljava/util/Map;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iput-object p1, p0, Lgc/e;->i:Ljava/util/Map;

    .line 58
    .line 59
    invoke-virtual {p2}, Lhc/h;->d()Lbc/f;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iput-object p1, p0, Lgc/e;->j:Lbc/f;

    .line 64
    .line 65
    invoke-virtual {p2}, Lhc/h;->g()Ljava/util/Map;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iput-object p1, p0, Lgc/e;->k:Ljava/util/Map;

    .line 70
    .line 71
    invoke-virtual {p2}, Lhc/h;->c()Ljava/util/Map;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    iput-object p1, p0, Lgc/e;->l:Ljava/util/Map;

    .line 76
    .line 77
    invoke-virtual {p2}, Lhc/h;->e()LUb/e;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    iput-object p1, p0, Lgc/e;->m:LUb/e;

    .line 82
    .line 83
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lgc/e;->i:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lgc/e;->f:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lgc/e;->d:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Lbc/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lgc/e;->j:Lbc/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lgc/e;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()Lhc/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lgc/e;->b:Lhc/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()Lkotlin/jvm/functions/Function2;
    .locals 1

    .line 1
    iget-object v0, p0, Lgc/e;->e:Lkotlin/jvm/functions/Function2;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lgc/e;->c:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method
