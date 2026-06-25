.class final Lj5/f$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj5/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/Class;

.field final b:LS4/k;


# direct methods
.method constructor <init>(Ljava/lang/Class;LS4/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj5/f$a;->a:Ljava/lang/Class;

    .line 5
    .line 6
    iput-object p2, p0, Lj5/f$a;->b:LS4/k;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method a(Ljava/lang/Class;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lj5/f$a;->a:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
