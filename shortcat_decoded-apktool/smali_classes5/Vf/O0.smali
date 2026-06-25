.class public final LVf/O0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LRf/b;


# static fields
.field public static final b:LVf/O0;


# instance fields
.field private final synthetic a:LVf/c0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LVf/O0;

    .line 2
    .line 3
    invoke-direct {v0}, LVf/O0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LVf/O0;->b:LVf/O0;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LVf/c0;

    .line 5
    .line 6
    const-string v1, "kotlin.Unit"

    .line 7
    .line 8
    sget-object v2, LTd/L;->a:LTd/L;

    .line 9
    .line 10
    invoke-direct {v0, v1, v2}, LVf/c0;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, LVf/O0;->a:LVf/c0;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public a(LUf/e;)V
    .locals 1

    .line 1
    const-string v0, "decoder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LVf/O0;->a:LVf/c0;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LVf/c0;->deserialize(LUf/e;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public b(LUf/f;LTd/L;)V
    .locals 1

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
    iget-object v0, p0, LVf/O0;->a:LVf/c0;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, LVf/c0;->serialize(LUf/f;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public bridge synthetic deserialize(LUf/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LVf/O0;->a(LUf/e;)V

    .line 2
    .line 3
    .line 4
    sget-object p1, LTd/L;->a:LTd/L;

    .line 5
    .line 6
    return-object p1
.end method

.method public getDescriptor()LTf/e;
    .locals 1

    .line 1
    iget-object v0, p0, LVf/O0;->a:LVf/c0;

    .line 2
    .line 3
    invoke-virtual {v0}, LVf/c0;->getDescriptor()LTf/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public bridge synthetic serialize(LUf/f;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, LTd/L;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, LVf/O0;->b(LUf/f;LTd/L;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
