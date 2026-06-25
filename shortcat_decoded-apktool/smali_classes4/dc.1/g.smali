.class public abstract Ldc/g;
.super Ldc/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private g:Ldc/k;


# direct methods
.method public constructor <init>(Ljava/lang/String;[Lpc/b;)V
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "desiredArgsTypes"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1, p2}, Ldc/a;-><init>(Ljava/lang/String;[Lpc/b;)V

    .line 12
    .line 13
    .line 14
    sget-object p1, Ldc/m;->b:Ldc/m;

    .line 15
    .line 16
    iput-object p1, p0, Ldc/g;->g:Ldc/k;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method protected final m()Ldc/k;
    .locals 1

    .line 1
    iget-object v0, p0, Ldc/g;->g:Ldc/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public final n(Ldc/m;)Ldc/g;
    .locals 1

    .line 1
    const-string v0, "queue"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Ldc/g;->g:Ldc/k;

    .line 7
    .line 8
    return-object p0
.end method
