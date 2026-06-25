.class public final LDb/k$z0;
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

.field final synthetic b:Lgc/d;


# direct methods
.method public constructor <init>(LDb/k;Lgc/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LDb/k$z0;->a:LDb/k;

    .line 2
    .line 3
    iput-object p2, p0, LDb/k$z0;->b:Lgc/d;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a([Ljava/lang/Object;LUb/u;)V
    .locals 4

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
    aget-object p1, p1, v2

    .line 19
    .line 20
    check-cast p1, Lexpo/modules/filesystem/legacy/FileSystemUploadOptions;

    .line 21
    .line 22
    check-cast v1, Ljava/lang/String;

    .line 23
    .line 24
    check-cast v0, Ljava/lang/String;

    .line 25
    .line 26
    iget-object v2, p0, LDb/k$z0;->a:LDb/k;

    .line 27
    .line 28
    sget-object v3, LDb/k$h;->a:LDb/k$h;

    .line 29
    .line 30
    invoke-static {v2, v0, v1, p1, v3}, LDb/k;->z(LDb/k;Ljava/lang/String;Ljava/lang/String;Lexpo/modules/filesystem/legacy/FileSystemUploadOptions;LDb/q;)Ldg/C;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iget-object v0, p0, LDb/k$z0;->a:LDb/k;

    .line 35
    .line 36
    invoke-static {v0}, LDb/k;->O(LDb/k;)Ldg/A;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    invoke-virtual {v0, p1}, Ldg/A;->a(Ldg/C;)Ldg/e;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    new-instance v0, LDb/k$g;

    .line 47
    .line 48
    iget-object v1, p0, LDb/k$z0;->a:LDb/k;

    .line 49
    .line 50
    invoke-direct {v0, p2, v1}, LDb/k$g;-><init>(LUb/u;LDb/k;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {p1, v0}, Ldg/e;->O1(Ldg/f;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_0
    new-instance p1, LDb/m;

    .line 58
    .line 59
    invoke-direct {p1}, LDb/m;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-interface {p2, p1}, LUb/u;->h(Lexpo/modules/kotlin/exception/CodedException;)V

    .line 63
    .line 64
    .line 65
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
    invoke-virtual {p0, p1, p2}, LDb/k$z0;->a([Ljava/lang/Object;LUb/u;)V

    .line 6
    .line 7
    .line 8
    sget-object p1, LTd/L;->a:LTd/L;

    .line 9
    .line 10
    return-object p1
.end method
