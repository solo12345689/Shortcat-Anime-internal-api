.class Lm1/h$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm1/h;->F(Lm1/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lm1/h;


# direct methods
.method constructor <init>(Lm1/h;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm1/h$a;->a:Lm1/h;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Lm1/i;Lm1/i;)I
    .locals 0

    .line 1
    iget p1, p1, Lm1/i;->c:I

    .line 2
    .line 3
    iget p2, p2, Lm1/i;->c:I

    .line 4
    .line 5
    sub-int/2addr p1, p2

    .line 6
    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lm1/i;

    .line 2
    .line 3
    check-cast p2, Lm1/i;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lm1/h$a;->a(Lm1/i;Lm1/i;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method
