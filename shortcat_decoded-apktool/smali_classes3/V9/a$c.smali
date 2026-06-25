.class LV9/a$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LV9/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# instance fields
.field final a:LV9/a$d;

.field final b:[J


# direct methods
.method constructor <init>()V
    .locals 2

    .line 1
    new-instance v0, LV9/a$d;

    invoke-direct {v0}, LV9/a$d;-><init>()V

    const/16 v1, 0xa

    new-array v1, v1, [J

    invoke-direct {p0, v0, v1}, LV9/a$c;-><init>(LV9/a$d;[J)V

    return-void
.end method

.method constructor <init>(LV9/a$c;)V
    .locals 2

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance v0, LV9/a$d;

    iget-object v1, p1, LV9/a$c;->a:LV9/a$d;

    invoke-direct {v0, v1}, LV9/a$d;-><init>(LV9/a$d;)V

    iput-object v0, p0, LV9/a$c;->a:LV9/a$d;

    .line 7
    iget-object p1, p1, LV9/a$c;->b:[J

    const/16 v0, 0xa

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object p1

    iput-object p1, p0, LV9/a$c;->b:[J

    return-void
.end method

.method constructor <init>(LV9/a$d;[J)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LV9/a$c;->a:LV9/a$d;

    .line 4
    iput-object p2, p0, LV9/a$c;->b:[J

    return-void
.end method
