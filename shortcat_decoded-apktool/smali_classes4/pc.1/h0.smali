.class public final Lpc/h0;
.super Lpc/s;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Lexpo/modules/kotlin/types/b;

.field private final c:Ljava/lang/ref/WeakReference;

.field private d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lexpo/modules/kotlin/types/b;LUb/d;)V
    .locals 1

    .line 1
    const-string v0, "unconvertedValue"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "typeConverter"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-direct {p0, v0}, Lpc/s;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lpc/h0;->a:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object p2, p0, Lpc/h0;->b:Lexpo/modules/kotlin/types/b;

    .line 18
    .line 19
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 20
    .line 21
    invoke-direct {p1, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lpc/h0;->c:Ljava/lang/ref/WeakReference;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lpc/h0;->d:Ljava/lang/Object;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lpc/h0;->b:Lexpo/modules/kotlin/types/b;

    .line 6
    .line 7
    iget-object v1, p0, Lpc/h0;->a:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v2, p0, Lpc/h0;->c:Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, LUb/d;

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    invoke-interface {v0, v1, v2, v3}, Lexpo/modules/kotlin/types/b;->a(Ljava/lang/Object;LUb/d;Z)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Lpc/h0;->d:Ljava/lang/Object;

    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Lpc/h0;->d:Ljava/lang/Object;

    .line 25
    .line 26
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-object v0
.end method
