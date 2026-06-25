.class public final Lf6/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field private a:I

.field private final b:LC5/a;


# direct methods
.method public constructor <init>(ILC5/a;)V
    .locals 1

    .line 1
    const-string v0, "bitmap"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput p1, p0, Lf6/a;->a:I

    .line 10
    .line 11
    iput-object p2, p0, Lf6/a;->b:LC5/a;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a()LC5/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/a;->b:LC5/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()I
    .locals 1

    .line 1
    iget v0, p0, Lf6/a;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/a;->b:LC5/a;

    .line 2
    .line 3
    invoke-virtual {v0}, LC5/a;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
