.class final LA3/e$d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LA3/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation


# instance fields
.field public final a:I

.field public final b:LA3/c;


# direct methods
.method public constructor <init>(ILA3/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LA3/e$d;->a:I

    .line 5
    .line 6
    iput-object p2, p0, LA3/e$d;->b:LA3/c;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(LA3/e$d;)I
    .locals 1

    .line 1
    iget v0, p0, LA3/e$d;->a:I

    .line 2
    .line 3
    iget p1, p1, LA3/e$d;->a:I

    .line 4
    .line 5
    invoke-static {v0, p1}, Ljava/lang/Integer;->compare(II)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, LA3/e$d;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LA3/e$d;->a(LA3/e$d;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
