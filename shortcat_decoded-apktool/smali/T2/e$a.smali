.class public final LT2/e$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LT2/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:[LT2/e$b;


# direct methods
.method public varargs constructor <init>([LT2/e$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LT2/e$a;->a:[LT2/e$b;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(I)LT2/e$b;
    .locals 1

    .line 1
    iget-object v0, p0, LT2/e$a;->a:[LT2/e$b;

    .line 2
    .line 3
    aget-object p1, v0, p1

    .line 4
    .line 5
    return-object p1
.end method

.method public b()I
    .locals 1

    .line 1
    iget-object v0, p0, LT2/e$a;->a:[LT2/e$b;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    return v0
.end method
