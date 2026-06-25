.class public final LWf/D;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LRf/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LWf/D$a;
    }
.end annotation


# static fields
.field public static final a:LWf/D;

.field private static final b:LTf/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LWf/D;

    .line 2
    .line 3
    invoke-direct {v0}, LWf/D;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LWf/D;->a:LWf/D;

    .line 7
    .line 8
    sget-object v0, LWf/D$a;->b:LWf/D$a;

    .line 9
    .line 10
    sput-object v0, LWf/D;->b:LTf/e;

    .line 11
    .line 12
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(LUf/e;)LWf/C;
    .locals 3

    .line 1
    const-string v0, "decoder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, LWf/r;->b(LUf/e;)V

    .line 7
    .line 8
    .line 9
    new-instance v0, LWf/C;

    .line 10
    .line 11
    sget-object v1, Lkotlin/jvm/internal/U;->a:Lkotlin/jvm/internal/U;

    .line 12
    .line 13
    invoke-static {v1}, LSf/a;->F(Lkotlin/jvm/internal/U;)LRf/b;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    sget-object v2, LWf/q;->a:LWf/q;

    .line 18
    .line 19
    invoke-static {v1, v2}, LSf/a;->i(LRf/b;LRf/b;)LRf/b;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-interface {v1, p1}, LRf/a;->deserialize(LUf/e;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Ljava/util/Map;

    .line 28
    .line 29
    invoke-direct {v0, p1}, LWf/C;-><init>(Ljava/util/Map;)V

    .line 30
    .line 31
    .line 32
    return-object v0
.end method

.method public b(LUf/f;LWf/C;)V
    .locals 2

    .line 1
    const-string v0, "encoder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "value"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, LWf/r;->c(LUf/f;)V

    .line 12
    .line 13
    .line 14
    sget-object v0, Lkotlin/jvm/internal/U;->a:Lkotlin/jvm/internal/U;

    .line 15
    .line 16
    invoke-static {v0}, LSf/a;->F(Lkotlin/jvm/internal/U;)LRf/b;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sget-object v1, LWf/q;->a:LWf/q;

    .line 21
    .line 22
    invoke-static {v0, v1}, LSf/a;->i(LRf/b;LRf/b;)LRf/b;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {v0, p1, p2}, LRf/k;->serialize(LUf/f;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public bridge synthetic deserialize(LUf/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LWf/D;->a(LUf/e;)LWf/C;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public getDescriptor()LTf/e;
    .locals 1

    .line 1
    sget-object v0, LWf/D;->b:LTf/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic serialize(LUf/f;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, LWf/C;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, LWf/D;->b(LUf/f;LWf/C;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
