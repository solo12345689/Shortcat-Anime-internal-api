.class public final LDb/k$j0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDb/k;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LDb/k;


# direct methods
.method public constructor <init>(LDb/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, LDb/k$j0;->a:LDb/k;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a([Ljava/lang/Object;LUb/u;)V
    .locals 6

    .line 1
    const-string v0, "<destruct>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "promise"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    aget-object v0, p1, v0

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    aget-object v1, p1, v1

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    aget-object v2, p1, v2

    .line 19
    .line 20
    const/4 v3, 0x3

    .line 21
    aget-object p1, p1, v3

    .line 22
    .line 23
    check-cast p1, Lexpo/modules/filesystem/legacy/FileSystemUploadOptions;

    .line 24
    .line 25
    check-cast v2, Ljava/lang/String;

    .line 26
    .line 27
    check-cast v1, Ljava/lang/String;

    .line 28
    .line 29
    check-cast v0, Ljava/lang/String;

    .line 30
    .line 31
    new-instance v3, LDb/k$j;

    .line 32
    .line 33
    iget-object v4, p0, LDb/k$j0;->a:LDb/k;

    .line 34
    .line 35
    invoke-direct {v3, v2, v4}, LDb/k$j;-><init>(Ljava/lang/String;LDb/k;)V

    .line 36
    .line 37
    .line 38
    iget-object v4, p0, LDb/k$j0;->a:LDb/k;

    .line 39
    .line 40
    new-instance v5, LDb/k$k;

    .line 41
    .line 42
    invoke-direct {v5, v3}, LDb/k$k;-><init>(LDb/b;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v4, v0, v1, p1, v5}, LDb/k;->z(LDb/k;Ljava/lang/String;Ljava/lang/String;Lexpo/modules/filesystem/legacy/FileSystemUploadOptions;LDb/q;)Ldg/C;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iget-object v0, p0, LDb/k$j0;->a:LDb/k;

    .line 50
    .line 51
    invoke-static {v0}, LDb/k;->O(LDb/k;)Ldg/A;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, p1}, Ldg/A;->a(Ldg/C;)Ldg/e;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iget-object v0, p0, LDb/k$j0;->a:LDb/k;

    .line 63
    .line 64
    invoke-static {v0}, LDb/k;->Q(LDb/k;)Ljava/util/Map;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    new-instance v1, LDb/k$e;

    .line 69
    .line 70
    invoke-direct {v1, p1}, LDb/k$e;-><init>(Ldg/e;)V

    .line 71
    .line 72
    .line 73
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    new-instance v0, LDb/k$i;

    .line 77
    .line 78
    iget-object v1, p0, LDb/k$j0;->a:LDb/k;

    .line 79
    .line 80
    invoke-direct {v0, p2, v1}, LDb/k$i;-><init>(LUb/u;LDb/k;)V

    .line 81
    .line 82
    .line 83
    invoke-interface {p1, v0}, Ldg/e;->O1(Ldg/f;)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, [Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p2, LUb/u;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LDb/k$j0;->a([Ljava/lang/Object;LUb/u;)V

    .line 6
    .line 7
    .line 8
    sget-object p1, LTd/L;->a:LTd/L;

    .line 9
    .line 10
    return-object p1
.end method
