.class public final LVf/N0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LRf/b;


# static fields
.field public static final a:LVf/N0;

.field private static final b:LTf/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LVf/N0;

    .line 2
    .line 3
    invoke-direct {v0}, LVf/N0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LVf/N0;->a:LVf/N0;

    .line 7
    .line 8
    sget-object v0, Lkotlin/jvm/internal/S;->a:Lkotlin/jvm/internal/S;

    .line 9
    .line 10
    invoke-static {v0}, LSf/a;->E(Lkotlin/jvm/internal/S;)LRf/b;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "kotlin.UShort"

    .line 15
    .line 16
    invoke-static {v1, v0}, LVf/G;->a(Ljava/lang/String;LRf/b;)LTf/e;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sput-object v0, LVf/N0;->b:LTf/e;

    .line 21
    .line 22
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
.method public a(LUf/e;)S
    .locals 1

    .line 1
    const-string v0, "decoder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LVf/N0;->getDescriptor()LTf/e;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {p1, v0}, LUf/e;->z(LTf/e;)LUf/e;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {p1}, LUf/e;->q()S

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-static {p1}, LTd/I;->b(S)S

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1
.end method

.method public b(LUf/f;S)V
    .locals 1

    .line 1
    const-string v0, "encoder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LVf/N0;->getDescriptor()LTf/e;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {p1, v0}, LUf/f;->D(LTf/e;)LUf/f;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {p1, p2}, LUf/f;->w(S)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public bridge synthetic deserialize(LUf/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LVf/N0;->a(LUf/e;)S

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p1}, LTd/I;->a(S)LTd/I;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public getDescriptor()LTf/e;
    .locals 1

    .line 1
    sget-object v0, LVf/N0;->b:LTf/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic serialize(LUf/f;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, LTd/I;

    .line 2
    .line 3
    invoke-virtual {p2}, LTd/I;->m()S

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    invoke-virtual {p0, p1, p2}, LVf/N0;->b(LUf/f;S)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
