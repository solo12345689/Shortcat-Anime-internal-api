.class public abstract Lw/T;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private a:I

.field private b:I

.field private final c:Lt/F;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x12c

    .line 3
    iput v0, p0, Lw/T;->a:I

    .line 4
    invoke-static {}, Lt/p;->c()Lt/F;

    move-result-object v0

    iput-object v0, p0, Lw/T;->c:Lt/F;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lw/T;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Lw/T;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public final b()I
    .locals 1

    .line 1
    iget v0, p0, Lw/T;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public final c()Lt/F;
    .locals 1

    .line 1
    iget-object v0, p0, Lw/T;->c:Lt/F;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d(I)V
    .locals 0

    .line 1
    iput p1, p0, Lw/T;->a:I

    .line 2
    .line 3
    return-void
.end method

.method public final e(Lw/Q;Lw/D;)Lw/Q;
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, Lw/Q;->c(Lw/D;)V

    .line 2
    .line 3
    .line 4
    return-object p1
.end method
