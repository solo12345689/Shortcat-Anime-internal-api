.class LV9/a$b;
.super LV9/a$a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LV9/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private final d:[J


# direct methods
.method constructor <init>()V
    .locals 4

    const/16 v0, 0xa

    .line 1
    new-array v1, v0, [J

    new-array v2, v0, [J

    new-array v3, v0, [J

    new-array v0, v0, [J

    invoke-direct {p0, v1, v2, v3, v0}, LV9/a$b;-><init>([J[J[J[J)V

    return-void
.end method

.method constructor <init>(LV9/a$e;)V
    .locals 4

    .line 2
    invoke-direct {p0}, LV9/a$b;-><init>()V

    .line 3
    iget-object v0, p0, LV9/a$a;->a:[J

    iget-object v1, p1, LV9/a$e;->a:LV9/a$d;

    iget-object v2, v1, LV9/a$d;->b:[J

    iget-object v1, v1, LV9/a$d;->a:[J

    invoke-static {v0, v2, v1}, LV9/f;->n([J[J[J)V

    .line 4
    iget-object v0, p0, LV9/a$a;->b:[J

    iget-object v1, p1, LV9/a$e;->a:LV9/a$d;

    iget-object v2, v1, LV9/a$d;->b:[J

    iget-object v1, v1, LV9/a$d;->a:[J

    invoke-static {v0, v2, v1}, LV9/f;->m([J[J[J)V

    .line 5
    iget-object v0, p1, LV9/a$e;->a:LV9/a$d;

    iget-object v0, v0, LV9/a$d;->c:[J

    iget-object v1, p0, LV9/a$b;->d:[J

    const/16 v2, 0xa

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 6
    iget-object v0, p0, LV9/a$a;->c:[J

    iget-object p1, p1, LV9/a$e;->b:[J

    sget-object v1, LV9/b;->b:[J

    invoke-static {v0, p1, v1}, LV9/f;->f([J[J[J)V

    return-void
.end method

.method constructor <init>([J[J[J[J)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2, p4}, LV9/a$a;-><init>([J[J[J)V

    .line 8
    iput-object p3, p0, LV9/a$b;->d:[J

    return-void
.end method


# virtual methods
.method public a([J[J)V
    .locals 1

    .line 1
    iget-object v0, p0, LV9/a$b;->d:[J

    .line 2
    .line 3
    invoke-static {p1, p2, v0}, LV9/f;->f([J[J[J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
