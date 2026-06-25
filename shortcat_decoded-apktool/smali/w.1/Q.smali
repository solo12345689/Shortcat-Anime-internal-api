.class public abstract Lw/Q;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Ljava/lang/Object;

.field private b:Lw/D;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method private constructor <init>(Ljava/lang/Object;Lw/D;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lw/Q;->a:Ljava/lang/Object;

    .line 4
    iput-object p2, p0, Lw/Q;->b:Lw/D;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lw/D;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lw/Q;-><init>(Ljava/lang/Object;Lw/D;)V

    return-void
.end method


# virtual methods
.method public final a()Lw/D;
    .locals 1

    .line 1
    iget-object v0, p0, Lw/Q;->b:Lw/D;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lw/Q;->a:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c(Lw/D;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw/Q;->b:Lw/D;

    .line 2
    .line 3
    return-void
.end method
