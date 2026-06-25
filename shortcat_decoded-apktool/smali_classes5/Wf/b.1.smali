.class public abstract LWf/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LRf/l;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LWf/b$a;
    }
.end annotation


# static fields
.field public static final d:LWf/b$a;


# instance fields
.field private final a:LWf/g;

.field private final b:LYf/e;

.field private final c:LXf/v;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LWf/b$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LWf/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LWf/b;->d:LWf/b$a;

    .line 8
    .line 9
    return-void
.end method

.method private constructor <init>(LWf/g;LYf/e;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LWf/b;->a:LWf/g;

    .line 4
    iput-object p2, p0, LWf/b;->b:LYf/e;

    .line 5
    new-instance p1, LXf/v;

    invoke-direct {p1}, LXf/v;-><init>()V

    iput-object p1, p0, LWf/b;->c:LXf/v;

    return-void
.end method

.method public synthetic constructor <init>(LWf/g;LYf/e;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LWf/b;-><init>(LWf/g;LYf/e;)V

    return-void
.end method


# virtual methods
.method public a()LYf/e;
    .locals 1

    .line 1
    iget-object v0, p0, LWf/b;->b:LYf/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b(LRf/k;Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "serializer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LXf/J;

    .line 7
    .line 8
    invoke-direct {v0}, LXf/J;-><init>()V

    .line 9
    .line 10
    .line 11
    :try_start_0
    invoke-static {p0, v0, p1, p2}, LXf/I;->a(LWf/b;LXf/w;LRf/k;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, LXf/J;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    invoke-virtual {v0}, LXf/J;->g()V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    invoke-virtual {v0}, LXf/J;->g()V

    .line 24
    .line 25
    .line 26
    throw p1
.end method

.method public final c(LRf/a;LWf/i;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "deserializer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "element"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, p2, p1}, LXf/b0;->a(LWf/b;LWf/i;LRf/a;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public final d(LRf/a;Ljava/lang/String;)Ljava/lang/Object;
    .locals 7

    .line 1
    const-string v0, "deserializer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "string"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, p2}, LXf/Y;->a(LWf/b;Ljava/lang/String;)LXf/X;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    new-instance v1, LXf/U;

    .line 16
    .line 17
    sget-object v3, LXf/e0;->c:LXf/e0;

    .line 18
    .line 19
    invoke-interface {p1}, LRf/a;->getDescriptor()LTf/e;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    const/4 v6, 0x0

    .line 24
    move-object v2, p0

    .line 25
    invoke-direct/range {v1 .. v6}, LXf/U;-><init>(LWf/b;LXf/e0;LXf/a;LTf/e;LXf/U$a;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p1}, LXf/U;->C(LRf/a;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {v4}, LXf/a;->v()V

    .line 33
    .line 34
    .line 35
    return-object p1
.end method

.method public final e(LRf/k;Ljava/lang/Object;)LWf/i;
    .locals 1

    .line 1
    const-string v0, "serializer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p2, p1}, LXf/d0;->d(LWf/b;Ljava/lang/Object;LRf/k;)LWf/i;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public final f()LWf/g;
    .locals 1

    .line 1
    iget-object v0, p0, LWf/b;->a:LWf/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()LXf/v;
    .locals 1

    .line 1
    iget-object v0, p0, LWf/b;->c:LXf/v;

    .line 2
    .line 3
    return-object v0
.end method
