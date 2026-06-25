.class Lf5/a$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf5/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method a(LP4/a$a;LP4/c;Ljava/nio/ByteBuffer;I)LP4/a;
    .locals 1

    .line 1
    new-instance v0, LP4/e;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3, p4}, LP4/e;-><init>(LP4/a$a;LP4/c;Ljava/nio/ByteBuffer;I)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
