.class public final Lsg/d$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsg/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final a:I

.field private final b:Ltg/k;


# direct methods
.method public constructor <init>(ILtg/k;)V
    .locals 1

    .line 1
    const-string v0, "data"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput p1, p0, Lsg/d$c;->a:I

    .line 10
    .line 11
    iput-object p2, p0, Lsg/d$c;->b:Ltg/k;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a()Ltg/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lsg/d$c;->b:Ltg/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()I
    .locals 1

    .line 1
    iget v0, p0, Lsg/d$c;->a:I

    .line 2
    .line 3
    return v0
.end method
