.class public LB3/v$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LB3/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:[B


# direct methods
.method private constructor <init>(III[B)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, LB3/v$c;->a:I

    .line 4
    iput p2, p0, LB3/v$c;->b:I

    .line 5
    iput p3, p0, LB3/v$c;->c:I

    .line 6
    iput-object p4, p0, LB3/v$c;->d:[B

    return-void
.end method

.method synthetic constructor <init>(III[BLB3/v$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, LB3/v$c;-><init>(III[B)V

    return-void
.end method
