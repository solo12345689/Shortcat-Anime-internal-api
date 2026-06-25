.class public final LH7/w;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private a:Ljava/lang/Integer;

.field private final b:Ljava/lang/Float;


# direct methods
.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/Float;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LH7/w;->a:Ljava/lang/Integer;

    iput-object p2, p0, LH7/w;->b:Ljava/lang/Float;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Integer;Ljava/lang/Float;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    .line 2
    :cond_1
    invoke-direct {p0, p1, p2}, LH7/w;-><init>(Ljava/lang/Integer;Ljava/lang/Float;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, LH7/w;->a:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Ljava/lang/Float;
    .locals 1

    .line 1
    iget-object v0, p0, LH7/w;->b:Ljava/lang/Float;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, LH7/w;->a:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method
