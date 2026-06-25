.class public abstract Ls0/h0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls0/h0$a;
    }
.end annotation


# static fields
.field public static final Companion:Ls0/h0$a;


# instance fields
.field private final intrinsicSize:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ls0/h0$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ls0/h0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ls0/h0;->Companion:Ls0/h0$a;

    .line 8
    .line 9
    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget-object v0, Lr0/l;->b:Lr0/l$a;

    invoke-virtual {v0}, Lr0/l$a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Ls0/h0;->intrinsicSize:J

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ls0/h0;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract applyTo-Pq9zytI(JLs0/k1;F)V
.end method

.method public getIntrinsicSize-NH-jbRc()J
    .locals 2

    .line 1
    iget-wide v0, p0, Ls0/h0;->intrinsicSize:J

    .line 2
    .line 3
    return-wide v0
.end method
