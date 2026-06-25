.class public final LCb/i$r;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCb/i;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LCb/i;


# direct methods
.method public constructor <init>(LCb/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, LCb/i$r;->a:LCb/i;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    const-string v0, "<destruct>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    aget-object p1, p1, v0

    .line 8
    .line 9
    check-cast p1, Ljava/net/URI;

    .line 10
    .line 11
    new-instance v1, Ljava/io/File;

    .line 12
    .line 13
    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/net/URI;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, LCb/i$r;->a:LCb/i;

    .line 17
    .line 18
    invoke-virtual {p1}, Lgc/c;->i()LUb/d;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1}, LUb/d;->s()Lexpo/modules/kotlin/services/FilePermissionService;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iget-object v2, p0, LCb/i$r;->a:LCb/i;

    .line 27
    .line 28
    invoke-virtual {v2}, Lgc/c;->i()LUb/d;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v2}, LUb/d;->B()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    const-string v4, "getPath(...)"

    .line 43
    .line 44
    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v2, v3}, Lexpo/modules/kotlin/services/FilePermissionService;->d(Landroid/content/Context;Ljava/lang/String;)Ljava/util/EnumSet;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    sget-object v2, Lexpo/modules/kotlin/services/FilePermissionService$a;->a:Lexpo/modules/kotlin/services/FilePermissionService$a;

    .line 52
    .line 53
    invoke-virtual {p1, v2}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-eqz p1, :cond_0

    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-eqz p1, :cond_0

    .line 64
    .line 65
    new-instance p1, Lexpo/modules/filesystem/PathInfo;

    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-direct {p1, v0, v1}, Lexpo/modules/filesystem/PathInfo;-><init>(ZLjava/lang/Boolean;)V

    .line 80
    .line 81
    .line 82
    return-object p1

    .line 83
    :cond_0
    new-instance p1, Lexpo/modules/filesystem/PathInfo;

    .line 84
    .line 85
    const/4 v1, 0x0

    .line 86
    invoke-direct {p1, v0, v1}, Lexpo/modules/filesystem/PathInfo;-><init>(ZLjava/lang/Boolean;)V

    .line 87
    .line 88
    .line 89
    return-object p1

    .line 90
    :cond_1
    new-instance p1, Lcc/i;

    .line 91
    .line 92
    invoke-direct {p1}, Lcc/i;-><init>()V

    .line 93
    .line 94
    .line 95
    throw p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, [Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LCb/i$r;->a([Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
