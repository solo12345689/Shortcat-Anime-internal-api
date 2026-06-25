.class final synthetic Lf9/C;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final synthetic a:Lf9/x;


# direct methods
.method synthetic constructor <init>(Lf9/x;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf9/C;->a:Lf9/x;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final synthetic a(Lf9/E;Ljava/lang/CharSequence;)Ljava/util/Iterator;
    .locals 2

    .line 1
    new-instance v0, Lf9/A;

    .line 2
    .line 3
    iget-object v1, p0, Lf9/C;->a:Lf9/x;

    .line 4
    .line 5
    invoke-direct {v0, p1, p2, v1}, Lf9/A;-><init>(Lf9/E;Ljava/lang/CharSequence;Lf9/x;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
