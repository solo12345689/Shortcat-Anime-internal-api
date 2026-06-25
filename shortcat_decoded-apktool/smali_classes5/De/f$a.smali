.class public final LDe/f$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDe/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LDe/f$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)LDe/f;
    .locals 3

    .line 1
    const-string v0, "klass"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LRe/b;

    .line 7
    .line 8
    invoke-direct {v0}, LRe/b;-><init>()V

    .line 9
    .line 10
    .line 11
    sget-object v1, LDe/c;->a:LDe/c;

    .line 12
    .line 13
    invoke-virtual {v1, p1, v0}, LDe/c;->b(Ljava/lang/Class;LQe/x$c;)V

    .line 14
    .line 15
    .line 16
    new-instance v1, LDe/f;

    .line 17
    .line 18
    invoke-virtual {v0}, LRe/b;->n()LRe/a;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const/4 v2, 0x0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    return-object v2

    .line 26
    :cond_0
    invoke-direct {v1, p1, v0, v2}, LDe/f;-><init>(Ljava/lang/Class;LRe/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 27
    .line 28
    .line 29
    return-object v1
.end method
