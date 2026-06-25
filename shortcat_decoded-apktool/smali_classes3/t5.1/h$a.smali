.class Lt5/h$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt5/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field public final a:Lt5/f;

.field public final b:Ljava/io/File;


# direct methods
.method constructor <init>(Ljava/io/File;Lt5/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lt5/h$a;->a:Lt5/f;

    .line 5
    .line 6
    iput-object p1, p0, Lt5/h$a;->b:Ljava/io/File;

    .line 7
    .line 8
    return-void
.end method
