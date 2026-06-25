.class Lqh/e$a;
.super Ljava/lang/Object;

# interfaces
.implements Lqh/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqh/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final a:Z

.field private final b:I

.field private final c:I

.field private final d:I

.field private final e:I

.field private final f:I

.field private final g:I


# direct methods
.method public constructor <init>(ZIIIIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lqh/e$a;->a:Z

    .line 5
    .line 6
    iput p2, p0, Lqh/e$a;->b:I

    .line 7
    .line 8
    iput p3, p0, Lqh/e$a;->c:I

    .line 9
    .line 10
    iput p4, p0, Lqh/e$a;->d:I

    .line 11
    .line 12
    iput p5, p0, Lqh/e$a;->e:I

    .line 13
    .line 14
    iput p6, p0, Lqh/e$a;->f:I

    .line 15
    .line 16
    iput p7, p0, Lqh/e$a;->g:I

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget v0, p0, Lqh/e$a;->b:I

    .line 2
    .line 3
    return v0
.end method
