.class public final LY/K;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private a:Z

.field private final b:LY/y;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Lk0/l;ZLY/y;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p2, p0, LY/K;->a:Z

    .line 3
    iput-object p3, p0, LY/K;->b:LY/y;

    return-void
.end method

.method public synthetic constructor <init>(Lk0/l;ZLY/y;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    const/4 p2, 0x0

    .line 4
    :cond_1
    invoke-direct {p0, p1, p2, p3}, LY/K;-><init>(Lk0/l;ZLY/y;)V

    return-void
.end method


# virtual methods
.method public final a()Lk0/l;
    .locals 2

    .line 1
    iget-boolean v0, p0, LY/K;->a:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    iget-object v0, p0, LY/K;->b:LY/y;

    .line 8
    .line 9
    invoke-virtual {v0}, LY/y;->k()LY/K;

    .line 10
    .line 11
    .line 12
    invoke-static {v1, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    return-object v1
.end method
