.class LTg/a$c;
.super Ljava/lang/Object;

# interfaces
.implements LFg/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LTg/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:I


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LTg/a$c;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput p2, p0, LTg/a$c;->b:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public t()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LTg/a$c;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
