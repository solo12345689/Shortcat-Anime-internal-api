.class public final Lsg/d$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsg/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:I

.field private final b:Ltg/k;

.field private final c:J


# direct methods
.method public constructor <init>(ILtg/k;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lsg/d$a;->a:I

    .line 5
    .line 6
    iput-object p2, p0, Lsg/d$a;->b:Ltg/k;

    .line 7
    .line 8
    iput-wide p3, p0, Lsg/d$a;->c:J

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lsg/d$a;->c:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final b()I
    .locals 1

    .line 1
    iget v0, p0, Lsg/d$a;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public final c()Ltg/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lsg/d$a;->b:Ltg/k;

    .line 2
    .line 3
    return-object v0
.end method
