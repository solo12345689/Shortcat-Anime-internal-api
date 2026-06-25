.class LYh/t$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYh/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private final a:LYh/s;

.field private final b:LYh/s;


# direct methods
.method private constructor <init>(LYh/s;LYh/s;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LYh/t$b;->a:LYh/s;

    .line 4
    iput-object p2, p0, LYh/t$b;->b:LYh/s;

    return-void
.end method

.method synthetic constructor <init>(LYh/s;LYh/s;LYh/t$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LYh/t$b;-><init>(LYh/s;LYh/s;)V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 4

    .line 1
    new-instance v0, LYh/t$c;

    .line 2
    .line 3
    iget-object v1, p0, LYh/t$b;->a:LYh/s;

    .line 4
    .line 5
    iget-object v2, p0, LYh/t$b;->b:LYh/s;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v1, v2, v3}, LYh/t$c;-><init>(LYh/s;LYh/s;LYh/t$a;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
