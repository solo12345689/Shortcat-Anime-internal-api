.class public abstract Lse/d0$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lse/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "b"
.end annotation


# static fields
.field static final synthetic c:[Lpe/m;


# instance fields
.field private final a:Lse/a1$a;

.field final synthetic b:Lse/d0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lkotlin/jvm/internal/F;

    .line 2
    .line 3
    const-class v1, Lse/d0$b;

    .line 4
    .line 5
    const-string v2, "moduleData"

    .line 6
    .line 7
    const-string v3, "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/jvm/internal/O;->k(Lkotlin/jvm/internal/E;)Lpe/o;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x1

    .line 18
    new-array v1, v1, [Lpe/m;

    .line 19
    .line 20
    aput-object v0, v1, v4

    .line 21
    .line 22
    sput-object v1, Lse/d0$b;->c:[Lpe/m;

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(Lse/d0;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lse/d0$b;->b:Lse/d0;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lse/e0;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lse/e0;-><init>(Lse/d0;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lse/a1;->b(Lie/a;)Lse/a1$a;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lse/d0$b;->a:Lse/a1$a;

    .line 16
    .line 17
    return-void
.end method

.method static synthetic a(Lse/d0;)LDe/k;
    .locals 0

    .line 1
    invoke-static {p0}, Lse/d0$b;->c(Lse/d0;)LDe/k;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final c(Lse/d0;)LDe/k;
    .locals 0

    .line 1
    invoke-interface {p0}, Lkotlin/jvm/internal/h;->j()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lse/Z0;->a(Ljava/lang/Class;)LDe/k;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method


# virtual methods
.method public final b()LDe/k;
    .locals 3

    .line 1
    iget-object v0, p0, Lse/d0$b;->a:Lse/a1$a;

    .line 2
    .line 3
    sget-object v1, Lse/d0$b;->c:[Lpe/m;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-virtual {v0, p0, v1}, Lse/a1$b;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "getValue(...)"

    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    check-cast v0, LDe/k;

    .line 18
    .line 19
    return-object v0
.end method
