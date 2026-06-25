.class public final Lu8/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu8/e$a;
    }
.end annotation


# static fields
.field private static final c:Lu8/e;


# instance fields
.field private final a:J

.field private final b:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lu8/e$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lu8/e$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lu8/e$a;->a()Lu8/e;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lu8/e;->c:Lu8/e;

    .line 11
    .line 12
    return-void
.end method

.method constructor <init>(JJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lu8/e;->a:J

    .line 5
    .line 6
    iput-wide p3, p0, Lu8/e;->b:J

    .line 7
    .line 8
    return-void
.end method

.method public static c()Lu8/e$a;
    .locals 1

    .line 1
    new-instance v0, Lu8/e$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lu8/e$a;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public a()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lu8/e;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public b()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lu8/e;->b:J

    .line 2
    .line 3
    return-wide v0
.end method
